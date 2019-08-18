all: native kotlin

native:
	@echo "Building C code."
	@if [ ! -d build/libs/shared ]; then mkdir -p build/libs/shared; fi
	@gcc \
		-o build/libs/shared/libhello.dylib \
		-shared -fPIC \
		-I/usr/lib/jvm/java-12-openjdk-amd64/include \
		-I/usr/lib/jvm/java-12-openjdk-amd64/include/linux \
		-I/Library/Java/JavaVirtualMachines/openjdk-12.0.1.jdk/Contents/Home/include \
		-I/Library/Java/JavaVirtualMachines/openjdk-12.0.1.jdk/Contents/Home/include/darwin \
		src/main/c/*.c

kotlin:
	@echo "Building Kotlin code."
	@if [ ! -d build/libs/shared ]; then mkdir -p build/libs/shared; fi
	@kotlinc-jvm \
		-d build/libs/greeting.jar \
		-include-runtime \
		src/main/kotlin/*.kt

clean:
	@if [ -d build ]; then rm -rf build; fi

run:
	@java \
		-Djava.library.path=build/libs/shared \
		-cp build/libs/greeting.jar \
		MainKt
