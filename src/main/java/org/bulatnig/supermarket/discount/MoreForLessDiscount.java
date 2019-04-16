package org.bulatnig.supermarket.discount;

public class MoreForLessDiscount extends SingleProductDiscount {

    private int moreCount;
    private int lessCount;

    public MoreForLessDiscount() {
        super(Type.MORE_FOR_LESS);
    }

    @Override
    protected int apply(int productPrice, int quantity, int totalPriceWithoutDiscount) {
        int numberOfApplications = quantity / moreCount;
        if (numberOfApplications == 0) {
            return 0;
        }
        int quantityPayingFor = (numberOfApplications * lessCount) + (quantity % moreCount);
        int priceWithDiscount = quantityPayingFor * productPrice;
        return totalPriceWithoutDiscount - priceWithDiscount;
    }
}
