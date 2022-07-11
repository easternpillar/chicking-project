package com.chicking.chicking.domain

import javax.persistence.*

@Entity
@Table(name = "member")
open class Member:BaseTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id", nullable = false)
    open var id: Long? = null


    @Column(name = "member_login_id", nullable = false, unique = true)
    open var loginId: String? = null


    @Column(name = "member_login_password", nullable = false)
    open var loginPassword: String? = null


    @Column(name = "member_name", nullable = false)
    open var name: String? = null


//    @Column(name = "member_chicken_list")
    @OneToMany
    open var chickenList: MutableList<Chicken>? = null
}