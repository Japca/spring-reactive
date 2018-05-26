import React,{ Component }from 'react'
import CSSModules from 'react-css-modules'
import styles from './drop.css'

@CSSModules(styles, {allowMultiple:true})
export default class Drop extends Component {

    render() {
        return (
            <div styleName="drop-container">
                <div>
                    Drop
                </div>
            </div>
        )
    }
}




