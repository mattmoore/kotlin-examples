all: kotlin native

kotlin:
	@echo "Building Kotlin code."
	@if [ ! -d build/libs/shared ]; then mkdir -p build/libs/shared; fi
	@kotlinc-jvm \
		-d build/libs/greeting.jar \
		-include-runtime \
		src/main/kotlin/*.kt

native:
	@echo "Building C code."
	@if [ ! -d build/libs/shared ]; then mkdir -p build/libs/shared; fi
	@gcc \
		-o build/libs/shared/libhello.so \
		-shared -fPIC \
		-I /usr/lib/jvm/java-12-openjdk-amd64/include \
		-I /usr/lib/jvm/java-12-openjdk-amd64/include/linux \
		src/main/c/*.c \
		src/main/c/*.h

clean:
	@if [ -d build ]; then rm -rf build; fi

run:
	@java \
		-Djava.library.path=build/libs/shared \
		-cp build/libs/greeting.jar \
		MainKt
