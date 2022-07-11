package com.chicking.chicking.domain

import javax.persistence.*

@Entity
@Table(name = "chicken")
open class Chicken :BaseTimeEntity(){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chicken_id", nullable = false)
    open val id: Long? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="chicken_brand_id")
    open var brand:Brand?=null

    @Column(name = "chicken_name", nullable = false)
    open var name: String? = null

    @Lob
    @Column(name = "chicken_image")
    open var image: ByteArray? = null


    @Column(name = "chicken_price", nullable = false)
    open var price: Int? = null


    @Column(name = "chicken_ingredient")
    open var ingredient: String? = null


    @Column(name = "chicken_allergy_info")
    open var allergyInfo: String? = null
}