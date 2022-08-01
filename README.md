Selamlar,

Projenin özellikleriyle ilgili olarak;

Page object model yapısı basit şekilde örneklendirilmiştir.
Kapsam genişledikçe üzerine eklenerek geliştirilebilecek şekilde mimari kurulması
amaçlanmıştır.

Base classta gerekli temel metotlar oluşturulmuştur.
Bu classtan beslenen homepage classı içide satın alma akışını sağlayacak metotlar oluşturuldu.
Step classları ise cucumber kütüphanesi ile feature dosyalarından beslenmektedir.
Feature dosyalarında yazılan caseler ile step classlarının metotları çalıştırılmıştır.

Cucumber kütüphanesinin en büyük avantajı geliştirme büyüdükçe case yönetimini kolaylaştırmasıdır.
Geliştirme sırasında önceki featurelar için yazılmış metotlar hızlı şekilde yeni featurelara entegre edilebilir.


Ayrıca Headless koşum için gerekli geliştirme yapılmış olsa da test edilen websitesinin yapısından kaynaklı olarak elementler cssSelector ve xpath ile 
alınmak durumunda kaldığı için css yüklemesi zorunlu olmuş ve tarayıcının açılması durumda kalınmıştır.

Fırsat verdiğiniz için teşekkürler.
