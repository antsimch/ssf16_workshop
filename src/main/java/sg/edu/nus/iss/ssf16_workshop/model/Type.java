package sg.edu.nus.iss.ssf16_workshop.model;

import jakarta.json.Json;
import jakarta.json.JsonNumber;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Type {
    
    private String type;
    private int count;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public JsonObjectBuilder toJSON(){
        return Json.createObjectBuilder()
                .add("type", this.getType())
                .add("count", this.getCount());
    }

    public static Type createJSON(JsonObject o) {
        Type t = new Type();
        JsonNumber count = o.getJsonNumber("count");
        String type = o.getString("type");
        t.setCount(count.intValue());
        t.setType(type);
        return t;
    }
}
