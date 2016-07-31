int div(int a, int b) throws
Exception {
  if (b == 0) {
    throw new Exception("Cannot divide by zero");
  } else {
    return a / b;
  }
}