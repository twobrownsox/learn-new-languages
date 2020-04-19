package paintjob;

public class Main {

    public static void main(String[] args) {
        testPaintJobGetBucketCount(-3.4,2.1,1.5,2);
        testPaintJobGetBucketCount(3.4,2.1,1.5,2);
        testPaintJobGetBucketCount(2.75,3.25,2.5,1);
        testPaintJobGetBucketCount(-3.4,2.1,1.5);
        testPaintJobGetBucketCount(3.4,2.1,1.5);
        testPaintJobGetBucketCount(7.25,4.3,2.35);
        testPaintJobGetBucketCount(0.0,2.1,1.5);
        testPaintJobGetBucketCount(3.4,1.5);
        testPaintJobGetBucketCount(6.26,2.2);
        testPaintJobGetBucketCount(3.26,0.75);
    }

    public static void testPaintJobGetBucketCount(double width, double height, double areaPerBucket, int extraBuckts) {
        System.out.println("width: " + width + ", height: " + height + ", areaPerBucket: " + areaPerBucket + ", extraBuckets: " + extraBuckts + " - "
                + PaintJob.getBucketCount(width, height, areaPerBucket, extraBuckts));
    }

    public static void testPaintJobGetBucketCount(double width, double height, double areaPerBucket) {
        System.out.println("width: " + width + ", height: " + height + ", areaPerBucket: " + areaPerBucket + " - "
                + PaintJob.getBucketCount(width, height, areaPerBucket));
    }

    public static void testPaintJobGetBucketCount(double area, double areaPerBucket) {
        System.out.println("area: " + area + ", areaPerBucket: " + areaPerBucket + " - "
                + PaintJob.getBucketCount(area, areaPerBucket));
    }

}
