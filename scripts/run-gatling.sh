#!/bin/bash

USERS=1
REPEAT=10
RAMP_UP=10
UNIT=times
MIN_IDLE=0
MAX_IDLE=0
PAGE_SIZE=100
TEST=

while getopts ":-:" opt; do
  case $opt in
    -)
        case "${OPTARG}" in
            token)
                val="${!OPTIND}"; OPTIND=$(( $OPTIND + 1 ))
                echo "Parsing option: '--${OPTARG}', value: '${val}'" >&2;
                TOKEN=${val}
                ;;
            baseUrl)
                val="${!OPTIND}"; OPTIND=$(( $OPTIND + 1 ))
                echo "Parsing option: '--${OPTARG}', value: '${val}'" >&2;
                BASE_URL=${val}
                ;;
            username)
                val="${!OPTIND}"; OPTIND=$(( $OPTIND + 1 ))
                echo "Parsing option: '--${OPTARG}', value: '${val}'" >&2;
                USERNAME=${val}
                ;;
            password)
                val="${!OPTIND}"; OPTIND=$(( $OPTIND + 1 ))
                echo "Parsing option: '--${OPTARG}', value: '${val}'" >&2;
                PASSWORD=${val}
                ;;
            users)
                val="${!OPTIND}"; OPTIND=$(( $OPTIND + 1 ))
                echo "Parsing option: '--${OPTARG}', value: '${val}'" >&2;
                USERS=${val}
                ;;
            rampUp)
                val="${!OPTIND}"; OPTIND=$(( $OPTIND + 1 ))
                echo "Parsing option: '--${OPTARG}', value: '${val}'" >&2;
                RAMP_UP=${val}
                ;;
            repeat)
                val="${!OPTIND}"; OPTIND=$(( $OPTIND + 1 ))
                echo "Parsing option: '--${OPTARG}', value: '${val}'" >&2;
                REPEAT=${val}
                ;;
            unit)
                val="${!OPTIND}"; OPTIND=$(( $OPTIND + 1 ))
                echo "Parsing option: '--${OPTARG}', value: '${val}'" >&2;
                UNIT=${val}
                ;;
            minIdle)
                val="${!OPTIND}"; OPTIND=$(( $OPTIND + 1 ))
                echo "Parsing option: '--${OPTARG}', value: '${val}'" >&2;
                MIN_IDLE=${val}
                ;;
            maxIdle)
                val="${!OPTIND}"; OPTIND=$(( $OPTIND + 1 ))
                echo "Parsing option: '--${OPTARG}', value: '${val}'" >&2;
                MAX_IDLE=${val}
                ;;
            test)
                val="${!OPTIND}"; OPTIND=$(( $OPTIND + 1 ))
                echo "Parsing option: '--${OPTARG}', value: '${val}'" >&2;
                TEST=${val}
                ;;
        esac;;
    \?)
      echo "Invalid option: -$OPTARG" >&2
      ;;
  esac
done

echo $TEST

./bin/gatling.sh -Dtoken=$TOKEN -DbaseUrl=$BASE_URL -Dusername=$USERNAME -Dpassword=$PASSWORD -Dusers=$USERS -DrampUp=$RAMP_UP -Drepeat=$REPEAT -Dunit=$UNIT -DminIdleTime=$MIN_IDLE -DmaxIdleTime=$MAX_IDLE -s $TEST
