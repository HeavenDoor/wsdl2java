set Axis_Lib=.\axis-1_4\lib
set Java_Cmd=java -Djava.ext.dirs=%Axis_Lib%
set Output_Path=.\src
set Package=hellojava
set WS=.\wsdl\hellojava.wsdl
%Java_Cmd% org.apache.axis.wsdl.WSDL2Java -o%Output_Path% -p%Package% %WS%

pause

