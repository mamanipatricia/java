class Hello {

  public static void main(String a[]) {
    int num = 2;
    byte b = 6;
    short sh = 5567;
    long l = 5834l; // add l at the end
    double d = 7.345546565;
    float aa = 7.45f;
    char name = 'p'; // chars accept single quotes
    boolean bb = false;
    System.out.println(3 + 5 + num);

    // literals
    int num1 = 0b101;
    int num2 = 0x7E;
    int num3 = 10_00_00_000;
    char vowel = 'a';
    vowel++; // will be b
    System.out.println(vowel);

    // Type conversion and Casting
    byte bt = 127;
    int aaa = b;

    // 2nd way
    int a2 = 128;
    byte k = (byte) a2;
    System.out.println(k); // here should'nt be able to convert from int (large number) to byte (short number)

    // type promotions
    byte a10 = 10;
    byte b10 = 30;

    int result = a10 * b10;
    System.out.println(result);
  }
}
