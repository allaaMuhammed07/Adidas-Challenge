package models;

public class Products {

        //Serialized object form of the request body
        private String id;
        private String name;
        private String description;
        private String _id;
        private String currency;
        private String price;

        public Products(String id, String name, String description){
                setId(id);
                setName(name);
                setDescription(description);
        }

        //Used in case deserialization
        public Products(String id, String name, String description, String _id, String currency, String price){
                setId(id);
                setName(name);
                setDescription(description);
                set_id(_id);
                setCurrency(currency);
                setPrice(price);
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String get_id() {
                return _id;
        }

        public void set_id(String _id) {
                this._id = _id;
        }

        public String getCurrency() {
                return currency;
        }

        public void setCurrency(String currency) {
                this.currency = currency;
        }

        public String getPrice() {
                return price;
        }

        public void setPrice(String price) {
                this.price = price;
        }
}
