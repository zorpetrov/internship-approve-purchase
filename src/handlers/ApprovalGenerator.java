
package handlers;

import common.Type;

public class ApprovalGenerator {
    
    public boolean approvalGen(Approver app, double cost, Type type){
        int consumLimit, clericLimit, gadgeLimit, gamingLimit, pcLimit;
        switch(app.getClass().getSimpleName()){
            case "Manager":
                consumLimit = 300;
                clericLimit = 500;
                gadgeLimit = 1000;
                gamingLimit = 3000;
                pcLimit = 5000;
                break;
            case "Director":
                consumLimit = 500;
                clericLimit = 1000;
                gadgeLimit = 1500;
                gamingLimit = 3500;
                pcLimit = 6000;
                break;
            case "VicePresident":
                consumLimit = 700;
                clericLimit = 1500;
                gadgeLimit = 2000;
                gamingLimit = 4500;
                pcLimit = 6500;
                break;
            case "President":
                consumLimit = 1000;
                clericLimit = 2000;
                gadgeLimit = 3000;
                gamingLimit = 5000;
                pcLimit = 8000;
                break;
            default:
                consumLimit = 0;
                clericLimit = 0;
                gadgeLimit = 0;
                gamingLimit = 0; 
                pcLimit = 0;
        }
        
        boolean result = false;

        switch (type) {
            case CONSUMABLES:
                if (cost <= consumLimit) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            case CLERICAL:
                if (cost <= clericLimit) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            case GADGETS:
                if (cost <= gadgeLimit) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            case GAMING:
                if (cost <= gamingLimit) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            case PC:
                if (cost <= pcLimit) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            default:
                result = false;
                return result;
        }
        return result;
        
    }
    
}
