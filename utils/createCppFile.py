#python 3

# use this script to create a cpp file for you problem in a fast way

import re
import os
import sys

ReferencesDirectory = "../References"

MainTemplate = """
#include <bits/stdc++.h>
using namespace std;
referencesGoesHere
int main() {

    return 0;
}
"""

def read__references():
    code_text = ""
    try:
        for file in os.listdir(ReferencesDirectory):
            filename, file_extension = os.path.splitext(file)
            file_extension = file_extension.lower()
            if(file_extension == 'cpp'):
                try:
                    with open(os.path.join(ReferencesDirectory,file) , 'r') as file_content:
                        code_text += "// content of {0} reference\n".format(filename)
                        code_text += file_content.read()+"\n"
                except Exception as e:
                    print("Error while reading file {0}\nError: {1}\n".format(file,e))
    except Exception as e:
        print("Error while reading references directory {0}\nError: {1}\n".format(ReferencesDirectory,e))
    return code_text

def no_params():
    print("Enter a problem name: ")
    problem_name = input()
    while(problem_name == ""):
        print("You have to enter a problem name: ")
        problem_name = input()
    print("Enter online judge name: (ex. codeforces or cf")
    oj_name = input()
    while(problem_name == ""):
        print("You have to enter a problem name: ")
        oj_name = input()
    createFile(problem_name,oj_name)

def createFile(problem_name,oj_name):
    shortcuts = {"cf":"codeforces"}
    problem_name = problem_name.lower()
    oj_name = oj_name.lower()
    if(oj_name in shortcuts):
        oj_name = shortcuts[oj_name]
    problem_name = re.sub(r'[^\w]+','_', problem_name)
    path = os.path.join(oj_name,problem_name+".cpp")
    path = os.path.join("../",path)
    references_code = read__references()
    text = MainTemplate.replace("referencesGoesHere",references_code)
    with open(path, "w") as text_file:
        text_file.write(text)
    print("File created successfully!")

if __name__=='__main__':
    if(len(sys.argv)!= 3):
        no_params()
    else:
        createFile(sys.argv[1],sys.argv[2])