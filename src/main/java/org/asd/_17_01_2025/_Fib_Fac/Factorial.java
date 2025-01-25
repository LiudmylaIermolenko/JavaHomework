package org.asd._17_01_2025._Fib_Fac;

        public class Factorial {

            private int n;

            public Factorial() {
                this.n = 0;
            }
            public Factorial(int number) {
                setNumber(number);
            }

            public int getNumber() {
                return n;
            }

            public void setNumber(int number) {
                if (number < 0){
                    System.out.println("Mistake! Number cannot be negative.");
                    this.n = 0;
                } else {
                this.n = number;
            }
        }


            public int factorialWhile (){
            int result = 1, i = 1;
            while (i <= n) {
                result *= i;
                i++;
            }
            return result;
        }
        public int factorialDoWhile (){
            int result = 1, i = 1;
            do {
                result *= i;
                i++;
            } while (i <= n);
            return result;
        }
        public int factorialFor (){
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

    }


