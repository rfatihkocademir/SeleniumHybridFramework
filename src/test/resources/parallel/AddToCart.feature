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
    And urun sayfasında urunun aciklamasinin goruntulendigi kontrol edilir
    And urun sayfasinda urunun renklerinin goruntulendigi kontrol edilir
    And urun konbin yap butonunun goruntulendigi kontrol edilir
    And urun benzer urunlerinin goruntule butonunun goruntulendigi kontrol edilir
    And urun sayfasinda urunun degerlendirme butonunun goruntulendigi kontrol edilir
    And urun sayfasinda konbin önerilerinin goruntulendigi kontrol edilir
    And urun sayfasinda benzer ürünlerin goruntulendigi kontrol edilir
    And urun sayfasında en cok satanların goruntulendigi kontrol edilir
    When Bir urun secenegi secilir
    When Sepete Ekle butonuna basilir
    When Sepetim butonuna tiklanir
    Then Sepet sayfasinin goruntulendigi kontrol edilir
    And Sepet sayfasinda urunun goruntulendigi kontrol edilir
    And Sepet sayfasinda urunun fiyatinin goruntulendigi kontrol edilir
    And Sepet sayfasinda urunun resmini goruntulendigi kontrol edilir
    When Anasayfaya donulur
    Then Sayfa basligi kontrol edilir "LC Waikiki"