public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(12, 16, 21);
        System.out.println("Length1 " + vector1.length());

        Vector vector2 = new Vector(6, 11, -8);
        System.out.println("Length2 " + vector2.length());
        System.out.println("Scalar product " + vector1.scalarProduct(vector2));

        Vector vectorProduct = vector1.vectorProduct(vector2);
        System.out.println("VectorProduct (" + vectorProduct.x + ", " + vectorProduct.y + ", " + vectorProduct.z + ")");

        double cos12 = vector1.cosineOfTheAngleBetweenVectors(vector2);
        System.out.println("cosineOfTheAngleBetweenVectors " + cos12);
        System.out.println("angle " + Math.acos(cos12));

        Vector vectorSum = vector1.vectorSum(vector2);
        System.out.println("VectorSum(" + vectorSum.x + ", " + vectorSum.y + ", " + vectorSum.z + ")");

        Vector vectorDifference = vector1.vectorDifference(vector2);
        System.out.println("VectorDifference(" + vectorDifference.x + ", " + vectorDifference.y + ", " + vectorDifference.z + ")");

        Vector[] vectors = Vector.returningArray(10);
        for (int i = 0; i < vectors.length; i++) {
            System.out.println("Vector" + (i + 1) + " (" + vectors[i].x + ", " + vectors[i].y + ", " + vectors[i].z + ")");
        }
    }
}
