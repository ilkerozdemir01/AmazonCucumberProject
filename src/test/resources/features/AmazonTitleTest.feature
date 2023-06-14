Feature: Amazon Title Testi
  Scenario: TC01_sayfanin_baslik_testi
    Given amazon sayfasına gidilir
    When sayfa basligi yazdirilir
    Then sayfa basliginda amazon yazısı oldugu test edilir
    And sayfa kapatilir