#! /bin/bash 
set -x
#if [ $# != 3 ]; then
#    echo "Usage:"
#    echo $0 "<thrift path> <java src path> <test script src path>"
#    exit 1
#fi 

ROOT_PATH=`pwd`

THRIFT_PATH=$ROOT_PATH
JAVA_SRC_PATH=$ROOT_PATH'../'
TEST_SCRIPT_PATH=$ROOT_PATH'../../testScript'

#CMD='thrift --gen '
#CMD_JAVA=$CMD'java '$THRIFT_PATH'/*.thrift'
#CMD_TS=$CMD'py '$THRIFT_PATH'/*.thrift'

#exec $CMD_JAVA
#exec $CMD_TS
#cp -r $THRIFT_PATH/gen-java/* $JAVA_SRC_PATH
#cp -r $THRIFT_PATH/gen-py/* $TEST_SCRIPT_PATH

for INPUT_FILE in `ls $THRIFT_PATH/*.thrift`;
do 
    thrift --gen java  $INPUT_FILE
    thrift --gen py $INPUT_FILE
done
#cp -r $THRIFT_PATH/gen-java/* $JAVA_SRC_PATH
#cp -r $THRIFT_PATH/gen-py/* $TEST_SCRIPT_PATH

set +x
