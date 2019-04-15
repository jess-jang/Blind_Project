package com.hour24.tb.model

//{
//    "meta": {
//    "total_count": 5,
//    "pageable_count": 5,
//    "is_end": true
//},
//    "documents": [
//    {
//        "title": "작은 <b>집</b> <b>짓기</b> 기본컨셉 - <b>집</b><b>짓기</b> 초기구상하기",
//        "contents": "이 점은 <b>집</b>을 지으면서 고민해보아야 한다. 하지만, 금액에 대한 가성비 대비 크게 문제되지 않을 부분이라 생각하여 설계로 극복하자고 생각했다. 전체 <b>집</b><b>짓기</b>의 기본방향은 크게 세 가지이다. 우선은 여가의 영역 증대이다. 현대 시대 일도 중요하지만, 여가시간 <b>집</b>에서 어떻게 보내느냐가 중요하니깐 이를 기본적...",
//        "url": "https://brunch.co.kr/@tourism/91",
//        "blogname": "정란수의 브런치",
//        "thumbnail": "http://search3.kakaocdn.net/argon/130x130_85_c/7r6ygzbvBDc",
//        "datetime": "2017-05-07T18:50:07.000+09:00"
//    },
//    ...
//    ]
//}

data class SearchModel(val meta: MetaModel,
                       val documents: ArrayList<DocumentItem>)

data class MetaModel(val total_count: Int,
                     val pageable_count: Int,
                     val is_end: Boolean)

data class DocumentItem(var filter: String,
                        val title: String,
                        val contents: String,
                        val url: String,
                        val blogname: String, // blog 이름
                        val cafename: String, // cafe 이름
                        val name: String, // blog, cafe name 통합
                        val thumbnail: String,
                        val datetime: String
)

