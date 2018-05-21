

MVN=mvn
JAVA=java

TEST_FILES_DIR=$(abspath ./python/testfiles)
OUT_DIR=./python/testfiles/

TEST_FILES_NAMES=expressions.txt functions.txt indexing.txt tmp.txt

TEST_FILES = $(addprefix $(TEST_FILES_DIR)/, $(TEST_FILES_NAMES))

TRANSLATOR =./console/target/console-1.0-SNAPSHOT.jar
CONFIG_FILE = ./console/src/main/resources/FunctionConfiguration.json
test:
	echo $(TEST_FILES)

package:
	$(MVN) package

build: package
	$(JAVA) -jar $(TRANSLATOR) -conf $(CONFIG_FILE) -o $(OUT_DIR) $(TEST_FILES)
