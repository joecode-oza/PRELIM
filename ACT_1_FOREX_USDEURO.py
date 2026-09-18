products = {"Apple":20, "Banana":19, "Cherry":18, "Blueberry":17, "Grapers":16, "Mango":15}

forex_usdeuro = 0.87

print("\n========== PRODUCT PRICE TO EUROS ==========\n")
print(f"{'PRODUCT':<10} {'PRICE:[USD]':^8}\t{'Price:[EURO]':^8}\n")


for name, price_usd in products.items():
    price_euro = round(price_usd * forex_usdeuro, 2)
    print(f"{name:<10} ${price_usd:^8.2f}\t€{price_euro:^8.2f}")
print("\n============================================\n")