package com.example.sumokwon;


import java.util.ArrayList;

public class WeatherConditionList {
    public ArrayList<WeatherCondition> mListSnow;
    public ArrayList<WeatherCondition> mListClearSky;
    public ArrayList<WeatherCondition> mListFew_Clouds;
    public ArrayList<WeatherCondition> mListScattered_Clouds;
    public ArrayList<WeatherCondition> mListBroken_Clouds;
    public ArrayList<WeatherCondition> mListShower_Rain;
    public ArrayList<WeatherCondition> mListRain;
    public ArrayList<WeatherCondition> mListThunderStorm;
    public ArrayList<WeatherCondition> mListMist;
    public ArrayList<WeatherCondition> mListWind;
    public ArrayList<WeatherCondition> mListWindDirection;

    public ArrayList<WeatherCondition> mListSnowToHangeul;
    public ArrayList<WeatherCondition> mListClearSkyToHangeul;
    public ArrayList<WeatherCondition> mListFew_CloudsToHangeul;
    public ArrayList<WeatherCondition> mListScattered_CloudsToHangeul;
    public ArrayList<WeatherCondition> mListBroken_CloudsToHangeul;
    public ArrayList<WeatherCondition> mListShower_RainToHangeul;
    public ArrayList<WeatherCondition> mListRainToHangeul;
    public ArrayList<WeatherCondition> mListThunderStormToHangeul;
    public ArrayList<WeatherCondition> mListMistToHangeul;
    public ArrayList<WeatherCondition> mListWindToHangeul;
    public ArrayList<WeatherCondition> mListWindDirectionToHangeul;

    public WeatherConditionList() {
        //http://openweathermap.org/weather-conditions
        mListThunderStorm = new ArrayList<WeatherCondition>(); // 11
        mListMist = new ArrayList<WeatherCondition>();        // 50
        mListRain = new ArrayList<WeatherCondition>();       // 10
        mListShower_Rain = new ArrayList<WeatherCondition>(); // 09
        mListBroken_Clouds = new ArrayList<WeatherCondition>(); // 04
        mListScattered_Clouds = new ArrayList<WeatherCondition>(); // 03
        mListFew_Clouds = new ArrayList<WeatherCondition>(); // 02
        mListClearSky = new ArrayList<WeatherCondition>(); // 01
        mListSnow = new ArrayList<WeatherCondition>(); // 13
        mListWind = new ArrayList<WeatherCondition>();
        mListWindDirection = new ArrayList<WeatherCondition>();
        mListThunderStormToHangeul = new ArrayList<WeatherCondition>(); // 11
        mListMistToHangeul = new ArrayList<WeatherCondition>();        // 50
        mListRainToHangeul = new ArrayList<WeatherCondition>();       // 10
        mListShower_RainToHangeul = new ArrayList<WeatherCondition>(); // 09
        mListBroken_CloudsToHangeul = new ArrayList<WeatherCondition>(); // 04
        mListScattered_CloudsToHangeul = new ArrayList<WeatherCondition>(); // 03
        mListFew_CloudsToHangeul = new ArrayList<WeatherCondition>(); // 02
        mListClearSkyToHangeul = new ArrayList<WeatherCondition>(); // 01
        mListSnowToHangeul = new ArrayList<WeatherCondition>(); // 13
        mListWindToHangeul = new ArrayList<WeatherCondition>();
        mListWindDirectionToHangeul = new ArrayList<WeatherCondition>();
        //-------------ThunderStrom------------------//
        mListThunderStorm.add(new WeatherCondition("200","thunderstorm with light rain"));
        mListThunderStorm.add(new WeatherCondition("201","thunderstorm with rain"));
        mListThunderStorm.add(new WeatherCondition("202","thunderstorm with heavy rain"));
        mListThunderStorm.add(new WeatherCondition("210","light thunderstorm"));
        mListThunderStorm.add(new WeatherCondition("211","thunderstorm"));
        mListThunderStorm.add(new WeatherCondition("212","heavy thunderstorm"));
        mListThunderStorm.add(new WeatherCondition("221","ragged thunderstorm"));
        mListThunderStorm.add(new WeatherCondition("230","thunderstorm with light drizzle"));
        mListThunderStorm.add(new WeatherCondition("231","thunderstorm with drizzle"));
        mListThunderStorm.add(new WeatherCondition("232","thunderstorm with heavy drizzle"));

        mListThunderStormToHangeul.add(new WeatherCondition("200","????????? ?????????"));
        mListThunderStormToHangeul.add(new WeatherCondition("201","????????? ???"));
        mListThunderStormToHangeul.add(new WeatherCondition("202","????????? ?????? ??????"));
        mListThunderStormToHangeul.add(new WeatherCondition("210","??????"));
        mListThunderStormToHangeul.add(new WeatherCondition("211","?????? ??????"));
        mListThunderStormToHangeul.add(new WeatherCondition("212","?????? ?????? ??????"));
        mListThunderStormToHangeul.add(new WeatherCondition("221","?????? ?????? ?????? ??????"));
        mListThunderStormToHangeul.add(new WeatherCondition("230","????????? ????????? ?????????"));
        mListThunderStormToHangeul.add(new WeatherCondition("231","????????? ?????????"));
        mListThunderStormToHangeul.add(new WeatherCondition("232","????????? ?????? ??????"));

        //------------Drizzle-------------------//
        mListShower_Rain.add(new WeatherCondition("300","light intensity drizzle"));
        mListShower_Rain.add(new WeatherCondition("301","drizzle"));
        mListShower_Rain.add(new WeatherCondition("302","heavy intensity drizzle"));
        mListShower_Rain.add(new WeatherCondition("310","light intensity drizzle rain"));
        mListShower_Rain.add(new WeatherCondition("311","drizzle rain"));
        mListShower_Rain.add(new WeatherCondition("312","heavy intensity drizzle rain"));
        mListShower_Rain.add(new WeatherCondition("313","shower rain and drizzle"));
        mListShower_Rain.add(new WeatherCondition("314","heavy shower rain and drizzle"));
        mListShower_Rain.add(new WeatherCondition("321","shower drizzle"));

        mListShower_RainToHangeul.add(new WeatherCondition("300","?????? ?????????"));
        mListShower_RainToHangeul.add(new WeatherCondition("301","?????????"));
        mListShower_RainToHangeul.add(new WeatherCondition("302","?????? ?????????"));
        mListShower_RainToHangeul.add(new WeatherCondition("310","?????? ?????????"));
        mListShower_RainToHangeul.add(new WeatherCondition("311","?????????"));
        mListShower_RainToHangeul.add(new WeatherCondition("312","?????? ?????????"));
        mListShower_RainToHangeul.add(new WeatherCondition("313","?????????"));
        mListShower_RainToHangeul.add(new WeatherCondition("314","?????? ?????????"));
        mListShower_RainToHangeul.add(new WeatherCondition("321","?????????"));
        //------------Rain----------------------//
        mListRain.add(new WeatherCondition("500","light rain"));
        mListRain.add(new WeatherCondition("501","moderate rain"));
        mListRain.add(new WeatherCondition("502","heavy intensity rain"));
        mListRain.add(new WeatherCondition("503","very heavy rain"));
        mListRain.add(new WeatherCondition("504","extreme rain"));
        mListSnow.add(new WeatherCondition("511","freezing rain"));
        mListShower_Rain.add(new WeatherCondition("520","light intensity shower rain"));
        mListShower_Rain.add(new WeatherCondition("521","shower rain"));
        mListShower_Rain.add(new WeatherCondition("522","heavy intensity shower rain"));
        mListShower_Rain.add(new WeatherCondition("531","ragged shower rain"));

        mListRainToHangeul.add(new WeatherCondition("500","????????? ???"));
        mListRainToHangeul.add(new WeatherCondition("501","???"));
        mListRainToHangeul.add(new WeatherCondition("502","?????? ???"));
        mListRainToHangeul.add(new WeatherCondition("503","?????? ??????"));
        mListRainToHangeul.add(new WeatherCondition("504","?????? ??????"));
        mListSnowToHangeul.add(new WeatherCondition("511","?????? ???"));
        mListShower_RainToHangeul.add(new WeatherCondition("520","????????? ?????????"));
        mListShower_RainToHangeul.add(new WeatherCondition("521","?????????"));
        mListShower_RainToHangeul.add(new WeatherCondition("522","?????? ?????????"));
        mListShower_RainToHangeul.add(new WeatherCondition("531","?????? ?????? ?????????"));

        //------------Snow----------------------//
        mListSnow.add(new WeatherCondition("600","light snow"));
        mListSnow.add(new WeatherCondition("601","snow"));
        mListSnow.add(new WeatherCondition("602","heavy snow"));
        mListSnow.add(new WeatherCondition("611","sleet"));
        mListSnow.add(new WeatherCondition("612","shower sleet"));
        mListSnow.add(new WeatherCondition("615","light rain and snow"));
        mListSnow.add(new WeatherCondition("616","rain and snow"));
        mListSnow.add(new WeatherCondition("620","light shower snow"));
        mListSnow.add(new WeatherCondition("621","shower snow"));
        mListSnow.add(new WeatherCondition("622","heavy shower snow"));

        mListSnowToHangeul.add(new WeatherCondition("600","?????? ???"));
        mListSnowToHangeul.add(new WeatherCondition("601","???"));
        mListSnowToHangeul.add(new WeatherCondition("602","?????? ???"));
        mListSnowToHangeul.add(new WeatherCondition("611","?????? ??????"));
        mListSnowToHangeul.add(new WeatherCondition("612","??? ?????? ??????"));
        mListSnowToHangeul.add(new WeatherCondition("615","?????? ?????? ???"));
        mListSnowToHangeul.add(new WeatherCondition("616","?????? ???"));
        mListSnowToHangeul.add(new WeatherCondition("620","???"));
        mListSnowToHangeul.add(new WeatherCondition("621","?????????"));
        mListSnowToHangeul.add(new WeatherCondition("622","?????? ?????????"));
        //------------Atmosphere----------------------//
        mListMist.add(new WeatherCondition("701","mist"));
        mListMist.add(new WeatherCondition("711","smoke"));
        mListMist.add(new WeatherCondition("721","haze"));
        mListMist.add(new WeatherCondition("731","sand, dust whirls"));
        mListMist.add(new WeatherCondition("741","fog"));
        mListMist.add(new WeatherCondition("751","sand"));
        mListMist.add(new WeatherCondition("761","dust"));
        mListMist.add(new WeatherCondition("762","volcanic ash"));
        mListMist.add(new WeatherCondition("771","squalls"));
        mListMist.add(new WeatherCondition("781","tornado"));

        mListMistToHangeul.add(new WeatherCondition("701","??????"));
        mListMistToHangeul.add(new WeatherCondition("711","??????"));
        mListMistToHangeul.add(new WeatherCondition("721","?????????"));
        mListMistToHangeul.add(new WeatherCondition("731","?????? ??????"));
        mListMistToHangeul.add(new WeatherCondition("741","??????"));
        mListMistToHangeul.add(new WeatherCondition("751","??????"));
        mListMistToHangeul.add(new WeatherCondition("761","??????"));
        mListMistToHangeul.add(new WeatherCondition("762","?????????"));
        mListMistToHangeul.add(new WeatherCondition("771","??????"));
        mListMistToHangeul.add(new WeatherCondition("781","??????"));

        //------------clouds----------------------//
        mListClearSky.add(new WeatherCondition("800","clear sky"));
        mListFew_Clouds.add(new WeatherCondition("801","few clouds"));
        mListScattered_Clouds.add(new WeatherCondition("802","scattered clouds"));
        mListBroken_Clouds.add(new WeatherCondition("803","broken clouds"));
        mListBroken_Clouds.add(new WeatherCondition("804","overcast clouds"));

        mListClearSkyToHangeul.add(new WeatherCondition("800","?????? ??????"));
        mListFew_CloudsToHangeul.add(new WeatherCondition("801","?????? ??????"));
        mListScattered_CloudsToHangeul.add(new WeatherCondition("802","?????? ??????"));
        mListBroken_CloudsToHangeul.add(new WeatherCondition("803","?????? ??????"));
        mListBroken_CloudsToHangeul.add(new WeatherCondition("804","??????"));

        //-----------------Additional----------//
        mListWind.add(new WeatherCondition("951","calm"));
        mListWind.add(new WeatherCondition("952","light breeze"));
        mListWind.add(new WeatherCondition("953","gentle breeze"));
        mListWind.add(new WeatherCondition("954","moderate breeze"));
        mListWind.add(new WeatherCondition("955","fresh breeze"));
        mListWind.add(new WeatherCondition("956","strong breeze"));
        mListWind.add(new WeatherCondition("957","high wind, near gale"));
        mListWind.add(new WeatherCondition("958","gale"));
        mListWind.add(new WeatherCondition("959","severe gale"));
        mListWind.add(new WeatherCondition("960","storm"));
        mListWind.add(new WeatherCondition("961","violent storm"));
        mListWind.add(new WeatherCondition("962","hurricane"));

        mListWindToHangeul.add(new WeatherCondition("951","?????? ??????"));
        mListWindToHangeul.add(new WeatherCondition("952","?????? ??????"));
        mListWindToHangeul.add(new WeatherCondition("953","?????? ??????"));
        mListWindToHangeul.add(new WeatherCondition("954","?????? ??????"));
        mListWindToHangeul.add(new WeatherCondition("955","?????? ??????"));
        mListWindToHangeul.add(new WeatherCondition("956","?????????"));
        mListWindToHangeul.add(new WeatherCondition("957","?????????"));
        mListWindToHangeul.add(new WeatherCondition("958","??????"));
        mListWindToHangeul.add(new WeatherCondition("959","????????? ??????"));
        mListWindToHangeul.add(new WeatherCondition("960","?????????"));
        mListWindToHangeul.add(new WeatherCondition("961","??????"));
        mListWindToHangeul.add(new WeatherCondition("962","????????????"));
    }



    public class WeatherCondition {
        String id;
        String meaning;

        public WeatherCondition(String id, String meaning) {
            this.id = id;
            this.meaning = meaning;
        }
        public String getId() {
            return id;
        }
        public String getMeaning() {
            return meaning;
        }
    }
}