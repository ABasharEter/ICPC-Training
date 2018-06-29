#python 3

# use this script to initialise your project directory to work with vs code in a fast way


# First of all you have to install MinGW on you machine and Microsoft C/C++ extension on VS Code.
# Then you can build your file that have by opening it then use the build command.
# This will compile your file into an exe file with the same name as your opend file.
# You can run your file after build with the termanal.
# Or you can debug it using the debug option in VS code. 
# Resources:
# HOWTO Install the MinGW: http://mingw.org/wiki/InstallationHOWTOforMinGW
# MinGW Getting Started: http://www.mingw.org/wiki/Getting_Started
# Microsoft C/C++ extension: https://marketplace.visualstudio.com/items?itemName=ms-vscode.cpptools

import os
import sys
import json

print("Enter MinGW Path (ex. C:/MinGW/64/MinGW64): ")
mingw_path = input()
if(mingw_path ==""):
    mingw_path = 'C:/MinGW/64/MinGW64'

while(not os.path.exists(mingw_path)):
    print("The provided directory dose not exsist!")
    print("Enter MinGW Path: ")
    mingw_path = input()

c_cpp_propertiesJson = json.dumps(
{
    "configurations": [
        {
            "name": "MinGW",
            "browse": {
                "path": [
                    "${workspaceFolder}"
                ],
                "limitSymbolsToIncludedHeaders": True
            },
            "includePath": [
                mingw_path,
                mingw_path+"/lib/gcc/mingw32/6.3.0/include/c++",
                mingw_path+"/lib/gcc/mingw32/6.3.0/include/c++/mingw32",
                mingw_path+"/lib/gcc/mingw32/6.3.0/include/c++/backward",
                mingw_path+"/lib/gcc/mingw32/6.3.0/include",
                mingw_path+"/include",
                mingw_path+"/lib/gcc/mingw32/6.3.0/include-fixed"
            ],
            "defines": [
                "_DEBUG",
                "UNICODE"
            ],
            "compilerPath": "g++.exe -g",
            "cStandard": "c11",
            "cppStandard": "c++17",
            "intelliSenseMode": "clang-x64"
        }
    ],
    "version": 4
})

tasksJson = json.dumps(
{
    "version": "2.0.0",
    "tasks": [
        {
            "label": "build current file",
            "type": "shell",
            "command": "g++",
            "args": [
                "-Wall","-std=c++17",
                "-g", "${file}", "-o", "${fileBasenameNoExtension}.exe"
            ],
            "group": {
                "kind": "build",
                "isDefault": True
            }
        }
    ]
})

launchJson = json.dumps(
{
    "version": "0.2.0",
    "configurations": [
        {
            "name": "(gdb) Launch",
            "type": "cppdbg",
            "request": "launch",
            "program": "${workspaceFolder}/${fileBasenameNoExtension}.exe",
            "args": [],
            "stopAtEntry": False,
            "cwd": "${workspaceFolder}",
            "environment": [],
            "externalConsole": True,
            "MIMode": "gdb",
            "miDebuggerPath": "C:/MinGW/64/MinGW64\\bin\\gdb.exe",
            "setupCommands": [
                {
                    "description": "Enable pretty-printing for gdb",
                    "text": "-enable-pretty-printing",
                    "ignoreFailures": True
                }
            ],
            "preLaunchTask": "build current file"
        }
    ]
})

os.chdir("..")
if(not os.path.exists('.vscode')):
    os.mkdir(".vscode")
with open('.vscode/c_cpp_properties.json', "w", encoding="utf8") as file:
    file.write(c_cpp_propertiesJson)

with open('.vscode/tasks.json',"w",encoding="utf8") as file:
    file.write(tasksJson)

with open('.vscode/launch.json',"w",encoding="utf8") as file:
    file.write(launchJson)
    
print("Config done go solve some problems XD")