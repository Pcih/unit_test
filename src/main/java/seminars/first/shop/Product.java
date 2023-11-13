package seminars.first.shop;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Product implements Comparable<Product> {
    private Integer cost; // Стоимость продукта
    private String title; // Название

    @Override
    public int compareTo(Product o) {
        return this.cost - o.cost;
    }
}