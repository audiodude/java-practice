class TriangleNumbers {
    public static void main(String[] args) {
        assert isTriangle(1, 2, 2) == true;
        assert isTriangle(1, 2, 3) == false;
        assert isTriangle(3, 4, 5) == true;
        assert isTriangle(5, 12, 13) == true;
        assert isTriangle(10, 6, 8) == true;
        assert isTriangle(1, 1, 2) == false;
        assert isTriangle(1, -5, 3) == false;
        assert isTriangle(0, 0, 0) == false;
    }

    public static boolean isTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 &&
                a + b > c &&
                a + c > b &&
                b + c > a;
    }
}
