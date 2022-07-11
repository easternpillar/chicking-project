package com.chicking.chicking.domain

import javax.persistence.*

@Entity
@Table(name = "store")
open class Store :BaseTimeEntity(){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "store_id", nullable = false)
    open var id: Long? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_brand_id")
    open var brand: Brand? = null

    @Column(name = "store_name", nullable = false, unique = true)
    open var name: String? = null
}