# Restoran Servisi

## Proje Açıklaması
Bu proje, bir restoran servisi uygulamasını içermektedir. Uygulama, restoran verilerinin yönetimini sağlar. Kullanıcılar restoran ekleyebilir, güncelleyebilir, silebilir ve mevcut restoranları alabilirler.

## Proje İçeriği
- Spring Boot: Uygulama Java tabanlı olup Spring Boot çerçevesi kullanılarak geliştirilmiştir.
- Apache Solr: Restoran verilerinin depolanması ve geri alınması için Apache Solr kullanılmıştır.
- RESTful API: Uygulama, RESTful API aracılığıyla servisle etkileşime geçmeyi sağlar.

## Özellikler
- Restoran Ekleme: Yeni restoranlar eklemek için API endpoint'i mevcuttur.
- Restoran Güncelleme: Var olan restoranların detaylarını güncelleme imkanı sağlanmıştır.
- Restoran Silme: Sistemden restoranları silme işlemi gerçekleştirilir.
- ID'ye Göre Restoran Alma: Restoranları ID'lerine göre almak için API endpoint'i bulunmaktadır.
- Tüm Restoranları Alma: Sistemdeki tüm restoranları listelemek için API endpoint'i sağlanmıştır.

## Kurulum ve Kullanım
1. Projeyi yerel makinenize klonlayın.
2. Java JDK'nın yüklü olduğundan emin olun.
3. Apache Solr'ü kurun ve çalıştırın.
4. Projeyi bir Java IDE'sinde açın.
5. Gerekirse Solr yapılandırmasını güncelleyin.
6. Uygulamayı çalıştırın ve API'yi kullanmaya başlayın.

## API Endpointleri
- POST /api/v1/restaurant/add: Yeni bir restoran ekler.
- GET /api/v1/restaurant/{id}: ID'ye göre restoranı alır.
- PUT /api/v1/restaurant/update: Var olan bir restoranı günceller.
- DELETE /api/v1/restaurant/delete/{id}: Bir restoranı siler.
- GET /api/v1/restaurant/all: Tüm restoranları alır.

## Lisans
Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için LICENSE dosyasına başvurun.

---

# USER Servisi

## Proje Açıklaması
Bu proje, bir kullanıcı servisi uygulamasını içermektedir. Uygulama, kullanıcı verilerinin yönetimini sağlar. Kullanıcılar ekleyebilir, güncelleyebilir, silebilir ve mevcut kullanıcıları alabilirler.

## Proje İçeriği
- Spring Boot: Uygulama Java tabanlı olup Spring Boot çerçevesi kullanılarak geliştirilmiştir.
- Veritabanı Entegrasyonu: Kullanıcı verileri bir veritabanında saklanır ve yönetilir.
- RESTful API: Uygulama, RESTful API aracılığıyla servisle etkileşime geçmeyi sağlar.

## Özellikler
- Kullanıcı Ekleme: Yeni kullanıcılar eklemek için API endpoint'i mevcuttur.
- Kullanıcı Güncelleme: Var olan kullanıcıların detaylarını güncelleme imkanı sağlanmıştır.
- Kullanıcı Silme: Sistemden kullanıcıları silme işlemi gerçekleştirilir.
- ID'ye Göre Kullanıcı Alma: Kullanıcıları ID'lerine göre almak için API endpoint'i bulunmaktadır.
- Tüm Kullanıcıları Alma: Sistemdeki tüm kullanıcıları listelemek için API endpoint'i sağlanmıştır.

## Kurulum ve Kullanım
1. Projeyi yerel makinenize klonlayın.
2. Java JDK'nın yüklü olduğundan emin olun.
3. Veritabanını kurun ve çalıştırın.
4. Projeyi bir Java IDE'sinde açın.
5. Uygulamayı çalıştırın ve API'yi kullanmaya başlayın.

## API Endpointleri
- POST /api/v1/user/add: Yeni bir kullanıcı ekler.
- GET /api/v1/user/{id}: ID'ye göre kullanıcıyı alır.
- PUT /api/v1/user/update: Var olan bir kullanıcıyı günceller.
- DELETE /api/v1/user/delete/{id}: Bir kullanıcıyı siler.
- GET /api/v1/user/all: Tüm kullanıcıları alır.

## Lisans
Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için LICENSE dosyasına başvurun.
