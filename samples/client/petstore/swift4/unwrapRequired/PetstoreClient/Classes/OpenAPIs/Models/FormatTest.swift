//
// FormatTest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct FormatTest: Codable {

    public var integer: Int?
    public var int32: Int?
    public var int64: Int64?
    public var number: Double?
    public var float: Float?
    public var double: Double?
    public var string: String?
    public var byte: Data?
    public var binary: URL?
    public var date: Date?
    public var dateTime: Date?
    public var uuid: UUID?
    public var password: String?

    public init(integer: Int?, int32: Int?, int64: Int64?, number: Double?, float: Float?, double: Double?, string: String?, byte: Data?, binary: URL?, date: Date?, dateTime: Date?, uuid: UUID?, password: String?) {
        self.integer = integer
        self.int32 = int32
        self.int64 = int64
        self.number = number
        self.float = float
        self.double = double
        self.string = string
        self.byte = byte
        self.binary = binary
        self.date = date
        self.dateTime = dateTime
        self.uuid = uuid
        self.password = password
    }


}

