// overloading

int maximumVal(int a, int b) {
  if(a > b) {
    return a;
  } 
  else {
    return b;
  }
}

int maximumVal(double a, double b) {
  if(a > b) {
    return a;
  } 
  else {
    return b;
  }
}

// maximumVall will work for doubles and ints. is overloaded
