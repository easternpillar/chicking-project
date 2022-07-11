package com.chicking.chicking.domain

import javax.persistence.*

@Entity
@Table(name = "brand")
open class Brand:BaseTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brand_id", nullable = false)
    open val id: Long? = null


    @Column(name = "brand_name", nullable = false, unique = true)
    open var name: String? = null


    @Lob
    @Column(name = "brand_logo")
    open var logo: ByteArray? = null


    @Column(name = "brand_store_list")
    @OneToMany(mappedBy = "brand")
    open var storeList: MutableList<Store>? = null

//    @Column(name="brand_chicken_list")
    @OneToMany(mappedBy = "brand")
    open var chickenList: MutableList<Chicken>? = null
}