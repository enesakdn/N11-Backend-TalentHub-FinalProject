package com.enesakdn.n11finaluserService.general;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RestResponse<T> {

    private T data;
    private LocalDateTime responseDate;
    private boolean isSuccess;
    private String messages;

    public RestResponse(T data, boolean isSuccess){
        this.data = data;
        this.isSuccess = isSuccess;
        this.responseDate = LocalDateTime.now();
    }

    public static <T> RestResponse<T> of(T t){
        return new RestResponse<>(t, true);
    }

    public static <T> RestResponse<T> error(T t){
        return new RestResponse<>(t, false);
    }

    public static <T> RestResponse<T> empty(){
        return new RestResponse<>(null, true);
    }
}

/*
* Bu sınıf, RESTful web servislerinde kullanılan bir yanıt nesnesini temsil eder. İşlevi şu şekildedir:

RestResponse<T> sınıfı, generic bir yapıya sahiptir ve yanıtta taşınacak verinin türünü belirler.
data, responseDate, isSuccess ve messages adında dört alan içerir.
Kurucusu, veri ve başarı durumu alır ve yanıt nesnesini oluşturur.
of, error ve empty adında üç fabrika metodu bulunur. of, başarılı yanıtları oluştururken; error,
*  hatalı yanıtları oluşturur; empty, veri olmadığı durumlar için boş yanıtları oluşturur.
Bu sınıf, RESTful servislerde istemcilere dönüş yaparken hem başarılı hem de hatalı durumları yönetir

*
* */