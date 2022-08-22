public class TransmissionImpl {
    public static void main(String[] args) {
        Manual m1= new Manual("Mp4",4,2.54,1.920,
                1.510,1.00,0,0);
        System.out.println(m1.showSpecs());
        Manual m2= new Manual("Mp5",5,3.543,1.904,
                1.280,0.914,0.757,0);
        System.out.println(m2.showSpecs());
        Manual m3= new Manual("Mp6",6,3.010,2.070,
                1.430,1.000,0.710,0.570);
        System.out.println(m3.showSpecs());
        Manual m4= new Manual("MD5",5,3.543,1.904,
                1.280,0.914,0.757,0);
        System.out.println(m4.showSpecs());
        Manual m5= new Manual("MD6",5,3.543,1.904,
                1.280,0.914,0.757,0);
        System.out.println(m5.showSpecs());
    }
}
