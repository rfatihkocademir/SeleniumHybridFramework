Feature: Satin Alma
 Scenario: Sepete urun ekleme senaryosu

    Given Anasayfaya gidilir "https://www.lcwaikiki.com/tr-TR/TR"
    Then Sayfa basligi kontrol edilir "LC Waikiki"
    And  Kategori navbarinin goruntulendigi kontrol edilir
    When Kategori navbarinda bir kategoriye tiklanir
    When Alt kategoriye tiklanir
    Then Kategori sayfasinin goruntulendigi kontrol edilir
    And Kategori sayfasinda urunlerin goruntulendigi kontrol edilir
    When Bir urune tiklanir
    Then urun sayfasinin goruntulendigi kontrol edilir
    And urun sayfasinda urunun fiyatinin goruntulendigi kontrol edilir
    And urun sayfasinda urunun resmini goruntulendigi kontrol edilir
    And urun sayfasinda urunun seceneklerinin goruntulendigi kontrol edilir
    When Bir urun secenegi secilir
    When Sepete Ekle butonuna basilir
    When Sepetim butonuna tiklanir
    Then Sepet sayfasinin goruntulendigi kontrol edilir
    And Sepet sayfasinda urunun goruntulendigi kontrol edilir
    And Sepet sayfasinda urunun fiyatinin goruntulendigi kontrol edilir
    And Sepet sayfasinda urunun resmini goruntulendigi kontrol edilir
    When Anasayfaya donulur
    Then Anasayfa sayfasinin goruntulendigi kontrol edilir ""