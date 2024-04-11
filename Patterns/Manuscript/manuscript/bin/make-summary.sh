#! /bin/bash
set -eu

cd $(dirname $0)/../manuscript

function part {
  section part $1
}

function ch {
  section ch $1
}

function appendix {
  section ap $1
}

function section {
  PREFIX=$1
  ID=$2
  FILE=$(ls | grep $PREFIX$ID)
  TITLE=$(grep '^= ' $FILE | cut -c 3-)
  echo "link:manuscript/$FILE[$TITLE]"
}

cat <<EOF

* $(part 1)
* $(ch 01)
* $(ch 02)
* $(ch 03)
* $(ch 04)
* $(ch 05)
* $(part 2)
* $(ch 06)
* $(ch 07)
* $(ch 08)
* $(ch 09)
* $(ch 10)
* $(ch 11)
* $(ch 12)
* $(part 3)
* $(ch 13)
* $(ch 14)
* $(ch 15)
* $(ch 16)
* $(ch 17)
* $(ch 18)
* $(ch 19)
* $(ch 20)
* $(ch 21)
* $(ch 22)
* $(ch 23)
* $(appendix A)
EOF
