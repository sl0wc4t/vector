public class Vector {
    double x;
    double y;
    double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double scalarProduct(Vector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector vectorProduct(Vector other) {
        return new Vector(this.y * other.z - this.z * other.y, this.z * other.x - this.x * other.z, this.x * other.y - this.y * other.x);
    }

    public double cosineOfTheAngleBetweenVectors(Vector other) {
        return this.scalarProduct(other) / this.length() / other.length();
    }

    public Vector vectorSum(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector vectorDifference(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public static Vector[] returningArray(int N) {
        Vector[] array = new Vector[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Vector(Math.random() * 100, Math.random() * 100, Math.random() * 100);
        }
        return array;
    }
}
