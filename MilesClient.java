public class MilesClient {
	
    public double distance(double mph,double hours){
       //create a new MtoKAdapter instance
    	MilesAdapter mToK = new MilesAdapter(mph, hours);
       //call its distance method
       return mToK.distance(); //distance in miles
    }
}
