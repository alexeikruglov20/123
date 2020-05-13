public interface Equipment {
    public long getNumber();
    public void setNumber(long number);
    public String getName();
    public void setName(String name);
    public EquipmentTypes getType();
    public void setType(EquipmentTypes type);
    default String stringValue(){
        return String.format("%s, %s, inventory number: %d.",getType(),getName(),getNumber());
    }
    default int hash(){
        return (int) getNumber()*getName().hashCode()*getType().hashCode();
    }
    default boolean isEquals(Equipment equipment){
        return getNumber() == equipment.getNumber() &&
                getName().equals(equipment.getName()) &&
                getType() == equipment.getType();
    }
}
