#!/usr/bin/env bash

ARTIFACTS_DIR="./build/reports/allure-report"
ARTIFACTS_FILE=${TRAVIS_JOB_NUMBER}_log.tar.gz

ls $ARTIFACTS_DIR
echo "COMPRESSING build artifacts."
cd $ARTIFACTS_DIR
tar -zcvf $ARTIFACTS_FILE *
# upload to http://transfer.sh
echo "Check file exists"
ls | grep $ARTIFACTS_FILE
echo "Uploading to transfer.sh"
curl --upload-file $ARTIFACTS_FILE https://transfer.sh/$ARTIFACTS_FILE