# First of all you have to install MinGW on you machine and Microsoft C/C++ extension on VS Code.
# Then you can build your file that have by opening it then use the build command.
# This will compile your file into an exe file with the same name as your opend file.
# You can run your file after build with the termanal.
# Or you can debug it using the debug option in VS code. 
# Resources:
# HOWTO Install the MinGW: http://mingw.org/wiki/InstallationHOWTOforMinGW
# MinGW Getting Started: http://www.mingw.org/wiki/Getting_Started
# Microsoft C/C++ extension: https://marketplace.visualstudio.com/items?itemName=ms-vscode.cpptools

$mingw_path = Read-Host 'Enter MinGW Path (ex. C:/MinGW/64/MinGW64)'
if(!$mingw_path){
    $mingw_path = 'C:/MinGW/64/MinGW64'
}
$c_cpp_propertiesJson = @"
{
    "configurations": [
        {
            "name": "MinGW",
            "browse": {
                "path": [
                    "`${workspaceFolder}"
                ],
                "limitSymbolsToIncludedHeaders": true
            },
            "includePath": [
                "`${workspaceFolder}",
                "$mingw_path/lib/gcc/mingw32/6.3.0/include/c++",
                "$mingw_path/lib/gcc/mingw32/6.3.0/include/c++/mingw32",
                "$mingw_path/lib/gcc/mingw32/6.3.0/include/c++/backward",
                "$mingw_path/lib/gcc/mingw32/6.3.0/include",
                "$mingw_path/include",
                "$mingw_path/lib/gcc/mingw32/6.3.0/include-fixed"
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
}
"@
$tasksJson = @"
{
    "version": "2.0.0",
    "tasks": [
        {
            "label": "build current file",
            "type": "shell",
            "command": "g++",
            "args": [
                "-g", "`${file}", "-o", "`${fileBasenameNoExtension}.exe"
            ],
            "group": {
                "kind": "build",
                "isDefault": true
            }
        }
    ]
}
"@
$launchJson = @"
{
    "version": "0.2.0",
    "configurations": [
        {
            "name": "(gdb) Launch",
            "type": "cppdbg",
            "request": "launch",
            "program": "`${workspaceFolder}/`${fileBasenameNoExtension}.exe",
            "args": [],
            "stopAtEntry": false,
            "cwd": "`${workspaceFolder}",
            "environment": [],
            "externalConsole": true,
            "MIMode": "gdb",
            "miDebuggerPath": "$mingw_path\\bin\\gdb.exe",
            "setupCommands": [
                {
                    "description": "Enable pretty-printing for gdb",
                    "text": "-enable-pretty-printing",
                    "ignoreFailures": true
                }
            ],
            "preLaunchTask": "build current file"
        }
    ]
}
"@

New-Item -ItemType Directory -Force -Path .\.vscode | Out-Null
Out-File -FilePath .\.vscode\tasks.json -InputObject $tasksJson -Encoding 'ASCII'
Out-File -FilePath .\.vscode\launch.json -InputObject $launchJson -Encoding 'ASCII'
Out-File -FilePath .\.vscode\c_cpp_properties.json -InputObject $c_cpp_propertiesJson -Encoding 'ASCII'