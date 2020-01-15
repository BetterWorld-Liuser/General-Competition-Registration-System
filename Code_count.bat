@echo off
REM 文件过滤器
set file_filter=*.java *.js *.css *.html *.xml *.vue 

REM 指定原目录
set src_dir=.\
REM 指定输出文件
set output_file=.\count.txt

cd %curr_dir%
del %output_file%
for /F %%i in ('dir /b/s/a:-d %file_filter% ^| findstr /v "node_modules" ^| findstr /v "docs"') do (
    type %%i>>%output_file%
)