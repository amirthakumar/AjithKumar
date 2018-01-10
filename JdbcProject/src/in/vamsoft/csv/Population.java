package in.vamsoft.csv;

public class Population {

  int stateCode;
  int districtCode;
  int subDistrictCode;
  String level;
  String areaName;
  String noofVillages;
  int totalPopulation;
  int malePopulation;
  int femalePopulation;
  public Population(int stateCode, int districtCode, int subDistrictCode, String level, String areaName,
      String noofVillages, int totalPopulation, int malePopulation, int femalePopulation) {
    super();
    this.stateCode = stateCode;
    this.districtCode = districtCode;
    this.subDistrictCode = subDistrictCode;
    this.level = level;
    this.areaName = areaName;
    this.noofVillages = noofVillages;
    this.totalPopulation = totalPopulation;
    this.malePopulation = malePopulation;
    this.femalePopulation = femalePopulation;
  }
  public int getStateCode() {
    return stateCode;
  }
  public void setStateCode(int stateCode) {
    this.stateCode = stateCode;
  }
  public int getDistrictCode() {
    return districtCode;
  }
  public void setDistrictCode(int districtCode) {
    this.districtCode = districtCode;
  }
  public int getSubDistrictCode() {
    return subDistrictCode;
  }
  public void setSubDistrictCode(int subDistrictCode) {
    this.subDistrictCode = subDistrictCode;
  }
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }
  public String getAreaName() {
    return areaName;
  }
  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }
  public String getNoofVillages() {
    return noofVillages;
  }
  public void setNoofVillages(String noofVillages) {
    this.noofVillages = noofVillages;
  }
  public int getTotalPopulation() {
    return totalPopulation;
  }
  public void setTotalPopulation(int totalPopulation) {
    this.totalPopulation = totalPopulation;
  }
  public int getMalePopulation() {
    return malePopulation;
  }
  public void setMalePopulation(int malePopulation) {
    this.malePopulation = malePopulation;
  }
  public int getFemalePopulation() {
    return femalePopulation;
  }
  public void setFemalePopulation(int femalePopulation) {
    this.femalePopulation = femalePopulation;
  }
  @Override
  public String toString() {
    return "Population [stateCode=" + stateCode + ", districtCode=" + districtCode + ", subDistrictCode="
        + subDistrictCode + ", level=" + level + ", areaName=" + areaName + ", noofVillages=" + noofVillages
        + ", totalPopulation=" + totalPopulation + ", malePopulation=" + malePopulation + ", femalePopulation="
        + femalePopulation + "]";
  }
  
  
  
  
  
}
