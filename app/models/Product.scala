package models

// Model Class
case class Product(
	ean: Long, name: String, description: String
)
// Data access object
object Product {
	
	var products = Set(
		Product(501013323412L, "Paperclips Large", "Large Plain Pack of 1000"),
		Product(501013323512L, "Giant Paperclips", "Giant Plain 51mm 100 pack"),
		Product(501013323612L, "Paperclip Giant Plain", "Giant Plain Pack of 10000"),
		Product(501013323712L, "No Tear Paper Clip", "No Tear Extra Large Pack of 1000"),
		Product(501013323812L, "Zebra Paperclips", "Zebra Length 28mm Assorted 150 Pack")
	)

	// Finder function
	def findAll: List[Product] = products.toList.sortBy(_.ean)

	// new finder method to find a product by its EAN
	def findByEan(ean: Long): Option[Product] = products.find(_.ean == ean)

	def add(product: Product): Unit = {
		products = products + product
	}
}

