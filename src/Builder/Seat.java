package Builder;

public record Seat (String Material, String Back, float BackHeight, float[] Colour){
    public String DelightLevel(){
        return switch (Material.toLowerCase()){
            case "leather" -> "Quite normal";
            case "vinyl" -> "Easy to clear";
            case "nylon" -> "Common and affordable";
            case "microfiber" -> "Superior breathability and comfort";
            default -> "Required right material";
        };
    }
}
