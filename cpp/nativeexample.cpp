#include <jni.h>
#include <iostream>
#include "modifiers_nativem_Native.h"  // generated header

using namespace std;

JNIEXPORT void JNICALL Java_modifiers_nativem_Native_sayHello
  (JNIEnv *, jobject) {
    cout << "Hello from native C++ code!" << endl;
}
