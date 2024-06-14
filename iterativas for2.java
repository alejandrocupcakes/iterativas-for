 int a = 3, b =4, c;
for (int i = 0; a <= 100; i++) {
    System.out.print(a + " ");
    c = a + b;
    a = b;
    b = c;
}
