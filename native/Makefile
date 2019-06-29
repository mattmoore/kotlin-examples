all: kotlin native

kotlin:
	@echo "Compiling Kotlin native code."
	@if [ ! -d build/libs ]; then mkdir -p build/libs; fi
	@kotlinc-native -o build/hello src/main/kotlin/*.kt

native:
	@echo "Building native code."
	@if [ ! -d build/libs/shared ]; then mkdir -p build/libs/shared; fi

run:
	@build/hello.kexe

clean:
	@if [ -d build ]; then rm -rf build; fi
	@echo "Cleaned."
