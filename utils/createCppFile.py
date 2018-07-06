#python 3

# use this script to create a cpp file for you problem in a fast way

import re
import os
import sys

ReferencesDirectory = "../References"

IncludesAndDefines ="""
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

"""

MainTemplate = """
headersGoesHere
referencesGoesHere
int main() {

    return 0;
}
"""
IncludesAndDefinesStartsWith = [
    "#include",
    "using namespace",
    "typedef",
    "#define"
]

def justify(l1):
    l1 = l1.strip().split()
    return ' '.join(l1)

def extract_headers(code):
    headers_lines = []
    lines = code.split('\n')
    code_lines = []
    for line in lines:
        added = False
        for hsw in IncludesAndDefinesStartsWith:
            if(line.startswith(hsw)):
                headers_lines.append(line)
                added = True
                break
        if(not added):
            code_lines.append(line)
    return headers_lines,code_lines
    
        

def read__references():
    headers_code,content_code = "",""
    try:
        files_content = []
        files_headers = []
        for file in os.listdir(ReferencesDirectory):
            filename, file_extension = os.path.splitext(file)
            file_extension = file_extension.lower()
            
            if(file_extension == '.cpp'):
                try:
                    with open(os.path.join(ReferencesDirectory,file) , 'r') as file_content:
                        h,c = extract_headers(file_content.read())
                        files_content.append((filename,c))
                        files_headers.extend([justify(x) for x in h])
                except Exception as e:
                    print("Error while reading file {0}\nError: {1}\n".format(file,e))
        h,_ = extract_headers(IncludesAndDefines)
        files_headers.extend([justify(x) for x in h])
        seen = set()
        seen_add = seen.add
        files_headers = [x for x in files_headers if not (x in seen or seen_add(x))]
        headers_code = '\n'.join(files_headers)
        content_code = ''
        for fn,c in files_content:
            content_code +="\n// content of {0} reference\n{1}\n".format(fn,'\n'.join(c))
    except Exception as e:
        print("Error while reading references directory {0}\nError: {1}\n".format(ReferencesDirectory,e))
    return headers_code,content_code

def no_params():
    print("Enter a problem name: ")
    problem_name = input()
    while(problem_name == ""):
        print("You have to enter a problem name: ")
        problem_name = input()
    print("Enter online judge name: (ex. codeforces or cf)")
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
    headers,content = read__references()
    text = MainTemplate.replace("headersGoesHere",headers)
    text = text.replace("referencesGoesHere",content)
    with open(path, "w") as text_file:
        text_file.write(text)
    print("File created successfully!")

if __name__=='__main__':
    if(len(sys.argv)!= 3):
        no_params()
    else:
        createFile(sys.argv[1],sys.argv[2])