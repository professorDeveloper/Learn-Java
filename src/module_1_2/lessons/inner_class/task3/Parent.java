package module_1_2.lessons.inner_class.task3;
/*
Parent classini yarating uning ichida bitta static va static bo'lmagan inner sinf yarating.
Har bir inner class ichida bethod yaratib ularning ichida local inner class yarating
*/

public class Parent {
    public static class TopLevel {
        public void helper() {
            class Inner {
                void hi() {
                    System.out.println("HelperTest");
                }
            }
            Inner inner = new Inner();
            inner.hi();
        }

    }

    public class NestedNormal {
        public void helper() {
            class Inner {
                void tellF() {
                    System.out.println("HiHelp");
                }
            }
            Inner inner = new Inner();
            inner.tellF();
        }
    }
}


