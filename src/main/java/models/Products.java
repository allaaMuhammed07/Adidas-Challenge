package models;

public class Products {

        //Serialized object form of the request body
        public String id;
        public String name;
        public String description;
        public String _id;

        public Products(String id, String name, String description){
                setId(id);
                setName(name);
                setDescription(description);
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
}
