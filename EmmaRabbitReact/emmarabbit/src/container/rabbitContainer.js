"use client";
import React, {useEffect, useState} from "react";
import Request from "../helpers/request";
import Rabbit from "../../components/rabbit";

const RabbitContainer = () => {
    const [rabbits, setRabbits] = useState([]);

    // useEffect(() => {
    //     const request = new Request();
    //     const rabbitPromise = request.get('http://localhost:8080/api/rabbits')

    //     const fetchData = async () => {
    //         try {
    //             const data = await rabbitPromise;
    //             setRabbits(data)
    //         } catch (error) {
    //             console.error('Error fetching data:', error)
    //         }
    //     };
    //     fetchData();
    // }, [])
    useEffect(() => {
        fetch("http://localhost:8080/rabbits")
        .then(res=>res.json())
        .then(data=>setRabbits(data))
    },[])

    console.log(rabbits);

    return(
        <span>
            <p className=" mt-10">Here is where the rabbits will be listed</p>
            <div>
                {rabbits.map((rabbit, index) => {
                    <React.Fragment key={index}>
                        <Rabbit rabbit = {rabbit} />
                    </React.Fragment>
                })}
            </div>
        </span>
    )
}
export default RabbitContainer;