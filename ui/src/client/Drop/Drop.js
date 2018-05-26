import React from 'react'
import CSSModules from 'react-css-modules'
import style from './drop.css'

const Drop = () => {

    return (
        <div styleName="drop-container">
            <div>
                Drop
            </div>
        </div>
    )
}

export default CSSModules(Drop, style);


