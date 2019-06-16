#include "hello.h"

JNIEXPORT jstring JNICALL Java_Person_greet(JNIEnv *env, jobject object) {
  // Get reference to the Kotlin Person class.
  jclass personClass = (*env)->FindClass(env, "Person");

  // Get reference to the Kotlin Person firstName and lastName variables.
  // Note that we're accessing "getFirstName" and "getLastName".
  // This is because Kotlin classes are compiled to Java bytecode
  //   and we have to access Kotlin attributes through the generated Java getters and setters.
  jmethodID getFirstName = (*env)->GetMethodID(env, personClass, "getFirstName", "()Ljava/lang/String;");
  jmethodID getLastName = (*env)->GetMethodID(env, personClass, "getLastName", "()Ljava/lang/String;");

  // Call the getters for firstName and lastName. Note that these methods return a jstring type.
  jstring firstName = (*env)->CallObjectMethod(env, object, getFirstName);
  jstring lastName = (*env)->CallObjectMethod(env, object, getLastName);

  // In order to concatenate the strings together,
  //   we need to first convert the jstring attributes to C strings.
  // We'll need to release these later.
  const char * firstNameBuffer = (*env)->GetStringUTFChars(env, firstName, NULL);
  const char * lastNameBuffer = (*env)->GetStringUTFChars(env, lastName, NULL);

  // Since we want to concatenate the first and last name, and add the greeting,
  //   we need to create a new C string buffer and start adding our text to it.
  char * greetingBuffer = (char *)malloc(0);
  strcpy(greetingBuffer, "Hello, ");
  strcat(greetingBuffer, firstNameBuffer);
  strcat(greetingBuffer, " ");
  strcat(greetingBuffer, lastNameBuffer);
  strcat(greetingBuffer, "!");

  // We need to still convert the greetingBuffer C string to a jstring object so it can be returned to our Kotlin code.
  jstring greeting = (*env)->NewStringUTF(env, greetingBuffer);

  // We need to release the resources we've created for the C and jstring conversion for concatenation.
  (*env)->ReleaseStringUTFChars(env, firstName, firstNameBuffer);
  (*env)->ReleaseStringUTFChars(env, lastName, lastNameBuffer);
  free(greetingBuffer);

  // Finally, return our greeting!
  return greeting;
}
