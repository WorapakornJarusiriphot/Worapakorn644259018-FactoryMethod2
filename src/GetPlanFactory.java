public class GetPlanFactory {

    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType){
        if(planType.equalsIgnoreCase("DOMESTICPLAN") || planType.equalsIgnoreCase("dp")) {
            return new DomesticPlan();
        } 
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN") || planType.equalsIgnoreCase("cp")){
            return new CommercialPlan();
        } 
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN") || planType.equalsIgnoreCase("ip")) {
            return new InstitutionalPlan();
        }
        return null;
    } 
}//end of GetPlanFactory class.
