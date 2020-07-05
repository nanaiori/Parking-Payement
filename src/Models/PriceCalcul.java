package Models;

public enum PriceCalcul {
	

    FIRST_Item {
        public double calculate(long duration) {
            return 0;
        }

        public boolean isApplicable(long duration) {
            return duration <= MINUTES_PER_HOUR;
        }
    },
    
    SECOND_Item {
    	
        @Override
        public double calculate(long duration) {
            double amount = ((duration - MINUTES_PER_HOUR) / MINUTES_PER_HOUR * FIRST_FOUR_HOUR_PRICE);
            if ((duration - MINUTES_PER_HOUR) % MINUTES_PER_HOUR > 0) {
                amount += 2;
            }
            return amount;
        }

        public boolean isApplicable(long duration) {
            return duration <= NUMBER_HOUR_OF_FIRST_INTERVAL * MINUTES_PER_HOUR;
        }
    },
    
    THIRD_Item {
        @Override
        public double calculate(long duration) {
            duration -= MINUTES_PER_HOUR * NUMBER_HOUR_OF_FIRST_INTERVAL;
            double amount = (FIRST_BILLABLE_HOURS * FIRST_FOUR_HOUR_PRICE) + ((duration / MINUTES_PER_HALF_HOUR) * PRICE_PER_HALF_HOUR);
            if (duration % MINUTES_PER_HALF_HOUR != 0) {
                amount += PRICE_PER_HALF_HOUR;
            }
            return amount;
        }

        public boolean isApplicable(long duration) {
            return !FIRST_Item.isApplicable(duration) && !SECOND_Item.isApplicable(duration);
        }
    };

	
    private static final int FIRST_FOUR_HOUR_PRICE = 2;
    private static final double PRICE_PER_HALF_HOUR = 1.5d;
    private static final int MINUTES_PER_HOUR = 60;
    private static final double MINUTES_PER_HALF_HOUR = 30;
    private static final double NUMBER_HOUR_OF_FIRST_INTERVAL = 4;
    private static final int FIRST_BILLABLE_HOURS = 3;

    public abstract double calculate(long duration);

    public abstract boolean isApplicable(long duration);

}
